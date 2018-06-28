package com.android.smendon.recyclerview.models;

/**
 * Created by Sanket Mendon on 30-05-2018.
 */

public class JobListing {
    private String jobTitle;
    private String company;
    private String jobLocation;
    private String jobType;
    private String minExperience;
    private String primarySkill;
    private String pay;

    public JobListing(String jobTitle, String company, String jobLocation, String jobType, String minExperience,
                      String primarySkill, String pay) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.jobLocation = jobLocation;
        this.jobType = jobType;
        this.minExperience = minExperience;
        this.primarySkill = primarySkill;
        this.pay = pay;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle() {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getMinExperience() {
        return minExperience;
    }

    public void setMinExperience(String minExperience) {
        this.minExperience = minExperience;
    }

    public String getPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }
}
