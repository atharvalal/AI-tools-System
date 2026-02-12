package model;

import java.time.LocalDate;
import java.util.Locale;

public class TeamMember {
    private int memberId;
    private String memberName;
    private String email;
    private String role;
    private LocalDate joinDate;
    private int promptsUsed;

    public TeamMember(int memberId, String memberName, String email, String role, LocalDate joinDate, int promptsUsed) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.email = email;
        this.role = role;
        this.joinDate = joinDate;
        this.promptsUsed = promptsUsed;

    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public int getPromptsUsed() {
        return promptsUsed;
    }
    public String memberData(){
        return "memberID: "+memberId+"\n";
    }
    
    @Override
    public String toString() {
        return "Member\n" +
                "ID: " + memberId + "\n" +
                "Name: " + memberName + "\n" +
                "Email: " + email + "\n" +
                "Role: " + role + "\n" +
                "Join Date: " + joinDate + "\n" +
                "Prompts Used: " + promptsUsed;
    }
}

