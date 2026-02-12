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
        if (!validateMemberId(memberId)) {
            throw new IllegalArgumentException("Member ID must be positive");
        }
        if (!validateMemberName(memberName)) {
            throw new IllegalArgumentException("Member name cannot be null or empty");
        }
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!validateRole(role)) {
            throw new IllegalArgumentException("Role cannot be null or empty");
        }
        if (!validateJoinDate(joinDate)) {
            throw new IllegalArgumentException("Join date cannot be in the future");
        }
        if (!validatePromptsUsed(promptsUsed)) {
            throw new IllegalArgumentException("Prompts used cannot be negative");
        }
        
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
    
    // Validation methods
    public boolean validateMemberId(int memberId) {
        return memberId > 0;
    }
    
    public boolean validateMemberName(String memberName) {
        return memberName != null && !memberName.trim().isEmpty();
    }
    
    public boolean validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) return false;
        return email.contains("@") && email.contains(".");
    }
    
    public boolean validateRole(String role) {
        return role != null && !role.trim().isEmpty();
    }
    
    public boolean validateJoinDate(LocalDate joinDate) {
        return joinDate != null && !joinDate.isAfter(LocalDate.now());
    }
    
    public boolean validatePromptsUsed(int promptsUsed) {
        return promptsUsed >= 0;
    }
}

