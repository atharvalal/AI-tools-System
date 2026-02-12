package model;

public interface TeamManageable {
    boolean addTeamMembers();
    boolean removeTeamMembers();
    int getAvailableSlots();
    int getTotalTeamUsage(int totalTeamUsage);
}
