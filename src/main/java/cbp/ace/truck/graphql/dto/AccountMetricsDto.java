package cbp.ace.truck.graphql.dto;

public class AccountMetricsDto {
    private Integer countCrew;
    private Integer countShipper;
    private Integer countConsignee;
    private Integer countEquipment;
    private Integer countConveyance;
    private Integer countManifestTemplate;
    private Integer countBOLTemplate;

    public AccountMetricsDto(Integer countCrew, Integer countShipper, Integer countConsignee, Integer countEquipment, Integer countConveyance, Integer countManifestTemplate, Integer countBOLTemplate) {
        this.countCrew = countCrew;
        this.countShipper = countShipper;
        this.countConsignee = countConsignee;
        this.countEquipment = countEquipment;
        this.countConveyance = countConveyance;
        this.countManifestTemplate = countManifestTemplate;
        this.countBOLTemplate = countBOLTemplate;
    }

    public Integer getCountCrew() {
        return countCrew;
    }

    public void setCountCrew(Integer countCrew) {
        this.countCrew = countCrew;
    }

    public Integer getCountShipper() {
        return countShipper;
    }

    public void setCountShipper(Integer countShipper) {
        this.countShipper = countShipper;
    }

    public Integer getCountConsignee() {
        return countConsignee;
    }

    public void setCountConsignee(Integer countConsignee) {
        this.countConsignee = countConsignee;
    }

    public Integer getCountEquipment() {
        return countEquipment;
    }

    public void setCountEquipment(Integer countEquipment) {
        this.countEquipment = countEquipment;
    }

    public Integer getCountConveyance() {
        return countConveyance;
    }

    public void setCountConveyance(Integer countConveyance) {
        this.countConveyance = countConveyance;
    }

    public Integer getCountManifestTemplate() {
        return countManifestTemplate;
    }

    public void setCountManifestTemplate(Integer countManifestTemplate) {
        this.countManifestTemplate = countManifestTemplate;
    }

    public Integer getCountBOLTemplate() {
        return countBOLTemplate;
    }

    public void setCountBOLTemplate(Integer countBOLTemplate) {
        this.countBOLTemplate = countBOLTemplate;
    }
}
