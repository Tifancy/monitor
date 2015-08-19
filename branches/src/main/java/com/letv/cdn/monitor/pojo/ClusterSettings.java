package com.letv.cdn.monitor.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ClusterSettings {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.id
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.cluster
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private String cluster;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.ips
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private String ips;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.process_key
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private String processKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.description
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.valid
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private Byte valid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.reboot
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private Byte reboot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cluster_settings.cmd
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    private String cmd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.id
     *
     * @return the value of cluster_settings.id
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.id
     *
     * @param id the value for cluster_settings.id
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.cluster
     *
     * @return the value of cluster_settings.cluster
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.cluster
     *
     * @param cluster the value for cluster_settings.cluster
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setCluster(String cluster) {
        this.cluster = cluster == null ? null : cluster.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.ips
     *
     * @return the value of cluster_settings.ips
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public String getIps() {
        return ips;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.ips
     *
     * @param ips the value for cluster_settings.ips
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setIps(String ips) {
        this.ips = ips == null ? null : ips.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.process_key
     *
     * @return the value of cluster_settings.process_key
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public String getProcessKey() {
        return processKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.process_key
     *
     * @param processKey the value for cluster_settings.process_key
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setProcessKey(String processKey) {
        this.processKey = processKey == null ? null : processKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.description
     *
     * @return the value of cluster_settings.description
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.description
     *
     * @param description the value for cluster_settings.description
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.valid
     *
     * @return the value of cluster_settings.valid
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.valid
     *
     * @param valid the value for cluster_settings.valid
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setValid(Byte valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.reboot
     *
     * @return the value of cluster_settings.reboot
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public Byte getReboot() {
        return reboot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.reboot
     *
     * @param reboot the value for cluster_settings.reboot
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setReboot(Byte reboot) {
        this.reboot = reboot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cluster_settings.cmd
     *
     * @return the value of cluster_settings.cmd
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cluster_settings.cmd
     *
     * @param cmd the value for cluster_settings.cmd
     *
     * @mbggenerated Thu Mar 12 15:58:04 CST 2015
     */
    public void setCmd(String cmd) {
        this.cmd = cmd == null ? null : cmd.trim();
    }
    
    @Override
    public String toString() {
    
        return ToStringBuilder.reflectionToString(this);
    }
}