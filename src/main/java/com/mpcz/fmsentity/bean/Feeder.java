package com.mpcz.fmsentity.bean;


import com.mpcz.fmsinterface.FeederInterface;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "Feeder")
@Table(name = "feeder")
public class Feeder implements FeederInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "substation_id")
    private long substationId;

    @Column(name = "feeder_name")
    private String feederName;

    @Column(name = "feeder_type")
    private String feederType;

    @Column(name = "status")
    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Timestamp createdOn;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_on")
    private Timestamp updatedOn;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getSubstationId() {
        return substationId;
    }

    @Override
    public void setSubstationId(long substationId) {
        this.substationId = substationId;
    }

    @Override
    public String getFeederName() {
        return feederName;
    }

    @Override
    public void setFeederName(String feederName) {
        this.feederName = feederName;
    }

    @Override
    public String getFeederType() {
        return feederType;
    }

    @Override
    public void setFeederType(String feederType) {
        this.feederType = feederType;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    @Override
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    @Override
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        return "Feeder{" +
                "id=" + id +
                ", substationId=" + substationId +
                ", feederName='" + feederName + '\'' +
                ", feederType='" + feederType + '\'' +
                ", status='" + status + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
