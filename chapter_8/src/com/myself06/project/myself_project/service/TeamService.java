package com.myself06.project.myself_project.service;

import com.myself06.project.myself_project.domain.Architect;
import com.myself06.project.myself_project.domain.Designer;
import com.myself06.project.myself_project.domain.Employee;
import com.myself06.project.myself_project.domain.Programmer;

/**
 * @author polar
 * @version 1.0
 * @since 2024/11/27 18:46
 * 功能：关于开发团队成员的管理：添加、删除等。
 */
public class TeamService {
    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;


    public Programmer[] getTeam() {
        Programmer[] p = new Programmer[total];  //p是要返回的数组
        for (int i = 0; i < total; i++) {
            p[i] = team[i];
        }
        return p;
    }

    public void addMember(Employee employee) {
//        失败信息包含以下几种：
//        成员已满，无法添加
        if (total == MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
//        该成员不是开发人员，无法添加
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
//                该员工已是某团队成员
        for (int i = 0; i < total; i++) {
            if (getTeam()[i].getId() == employee.getId()) {
                throw new TeamException("该员工已是某团队成员");
            }
        }
//        该员工正在休假，无法添加
        if (((Programmer) employee).getStatus() != Status.FREE) {
            throw new TeamException("该员工正在休假，无法添加");
        }
//                该员工已在本开发团队中
//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员
        int programmerNum = 0;
        int designerNum = 0;
        int ArchitectNum = 0;
        for (int i = 0; i < total; i++) {
            if (getTeam()[i] instanceof Architect) {
                ArchitectNum++;
            } else if (getTeam()[i] instanceof Designer) {
                designerNum++;
            } else  {
                programmerNum++;
            }
        }
        if (employee instanceof Architect) {
            if (ArchitectNum >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (employee instanceof Designer) {
            if (designerNum >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if (programmerNum >=3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }


        team[total++] = (Programmer) employee;
        ((Programmer) employee).setMemberId(counter++);
        ((Programmer) employee).setStatus(Status.BUSY);

    }

//    public void removeMember(int number) {
//        for (int i = 0; i < team.length; i++) {
//            if (team[i].getMemberId() == number) {
//                team[number].setStatus(Status.FREE);
//                break;
//            } else {
//                throw new TeamException("没找到人");
//            }
//
//        }
//        for (int i = number; i <total-1 ; i++) {
//            team[i] = team[i + 1];
//            team[total - 1] = null;
//            total--;
//        }
//
//    }
public void removeMember(int memberId)  {
    int i;
    // 找到指定memberId的员工，并删除
    for (i = 0; i < total; i++) {
        if (team[i].getMemberId() == memberId) {
            team[i].setStatus(Status.FREE);
            break;
        }
    }
    // 如果遍历一遍，都找不到，则报异常
    if (i == total) {
        throw new TeamException("找不到该成员，无法删除");
    }
    // 后面的元素覆盖前面的元素
    for (int j = i + 1; j < total; j++) {
        team[j - 1] = team[j];
    }
    team[--total] = null;
}


    public  void  teamMemberDetail(Programmer[] programmers){
        for (int i = 0; i < programmers.length; i++) {


        }

    }
}
