package com.org.ticketor.dicts;

public enum AccessLevelEnum {
    MANAGER("Manager"),
    FAN("Fan");

    private final String accessLevel;

    private AccessLevelEnum(String accessLevel){
        this.accessLevel = accessLevel;
    }

    public String getAcessLevel(){
        return this.accessLevel;
    }
}
