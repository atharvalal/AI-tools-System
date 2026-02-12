package model;

import java.time.LocalDate;

public interface Validatable {
    boolean validateMemberId(int memberId);
    boolean validateMemberName(String memberName);
    boolean validateEmail(String email);
    boolean validateRole(String role);
    boolean validateJoinDate(LocalDate joinDate);
    boolean validatePromptsUsed(int promptsUsed);
}
