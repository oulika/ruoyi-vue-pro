package cn.iocoder.yudao.module.yideyifeng.controller.admin.behaviorrecords.vo;
import cn.idev.excel.FastExcel;
import cn.idev.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MedicalEthicsData {
    // 基本信息
    private String name;

    // ========== 第一季度数据 ==========
    private Double honorsS1;
    private Double commendationsS1;
    private Double integrityS1;
    private Double socialPublicWelfareS1;
    private Double professionalStandardsS1;
    private Double serviceQualityS1;
    private Double evaluationS1;
    private Double complaintsS1;
    private Double disciplinaryDisS1;
    private Double disciplinaryHonestS1;
    private Double disciplinaryCarS1;
    private Double trainingStudyS1;
    private Double trainingTripleCheckS1;
    private Double meetingS1;

    // ========== 第二季度数据 ==========
    private Double honorsS2;
    private Double commendationsS2;
    private Double integrityS2;
    private Double socialPublicWelfareS2;
    private Double professionalStandardsS2;
    private Double serviceQualityS2;
    private Double evaluationS2;
    private Double complaintsS2;
    private Double disciplinaryDisS2;
    private Double disciplinaryHonestS2;
    private Double disciplinaryCarS2;
    private Double trainingStudyS2;
    private Double trainingTripleCheckS2;
    private Double meetingS2;

    // ========== 第三季度数据 ==========
    private Double honorsS3;
    private Double commendationsS3;
    private Double integrityS3;
    private Double socialPublicWelfareS3;
    private Double professionalStandardsS3;
    private Double serviceQualityS3;
    private Double evaluationS3;
    private Double complaintsS3;
    private Double disciplinaryDisS3;
    private Double disciplinaryHonestS3;
    private Double disciplinaryCarS3;
    private Double trainingStudyS3;
    private Double trainingTripleCheckS3;
    private Double meetingS3;

    // ========== 第四季度数据 ==========
    private Double honorsS4;
    private Double commendationsS4;
    private Double integrityS4;
    private Double socialPublicWelfareS4;
    private Double professionalStandardsS4;
    private Double serviceQualityS4;
    private Double evaluationS4;
    private Double complaintsS4;
    private Double disciplinaryDisS4;
    private Double disciplinaryHonestS4;
    private Double disciplinaryCarS4;
    private Double trainingStudyS4;
    private Double trainingTripleCheckS4;
    private Double meetingS4;

    // 年度总分和是否不合格（可选）
    private Double totalScore;
    private Boolean unqualified;

    // 构造器
    public MedicalEthicsData() {
        initializeAllFields();
    }

    public MedicalEthicsData(String name) {
        this.name = name;
        initializeAllFields();
    }

    private void initializeAllFields() {
        // 初始化所有数值字段为0.0或0
        honorsS1 = 0.0;
        commendationsS1 = 0.0;
        integrityS1 = 0.0;
        socialPublicWelfareS1 = 0.0;
        professionalStandardsS1 = 0.0;
        serviceQualityS1 = 0.0;
        evaluationS1 = 0.0;
        complaintsS1 = 0.0;
        disciplinaryDisS1 = 0.0;
        disciplinaryHonestS1 = 0.0;
        disciplinaryCarS1 = 0.0;
        trainingStudyS1 = 0.0;
        trainingTripleCheckS1 = 0.0;
        meetingS1 = 0.0;

        honorsS2 = 0.0;
        commendationsS2 = 0.0;
        integrityS2 = 0.0;
        socialPublicWelfareS2 = 0.0;
        professionalStandardsS2 = 0.0;
        serviceQualityS2 = 0.0;
        evaluationS2 = 0.0;
        complaintsS2 = 0.0;
        disciplinaryDisS2 = 0.0;
        disciplinaryHonestS2 = 0.0;
        disciplinaryCarS2 = 0.0;
        trainingStudyS2 = 0.0;
        trainingTripleCheckS2 = 0.0;
        meetingS2 = 0.0;

        honorsS3 = 0.0;
        commendationsS3 = 0.0;
        integrityS3 = 0.0;
        socialPublicWelfareS3 = 0.0;
        professionalStandardsS3 = 0.0;
        serviceQualityS3 = 0.0;
        evaluationS3 = 0.0;
        complaintsS3 = 0.0;
        disciplinaryDisS3 = 0.0;
        disciplinaryHonestS3 = 0.0;
        disciplinaryCarS3 = 0.0;
        trainingStudyS3 = 0.0;
        trainingTripleCheckS3 = 0.0;
        meetingS3 = 0.0;

        honorsS4 = 0.0;
        commendationsS4 = 0.0;
        integrityS4 = 0.0;
        socialPublicWelfareS4 = 0.0;
        professionalStandardsS4 = 0.0;
        serviceQualityS4 = 0.0;
        evaluationS4 = 0.0;
        complaintsS4 = 0.0;
        disciplinaryDisS4 = 0.0;
        disciplinaryHonestS4 = 0.0;
        disciplinaryCarS4 = 0.0;
        trainingStudyS4 = 0.0;
        trainingTripleCheckS4 = 0.0;
        meetingS4 = 0.0;

        totalScore = 0.0;
        unqualified = false;
    }

    // 将对象转换为填充Map
    public Map<String, Object> toFillMap() {
        Map<String, Object> map = new HashMap<>();

        // 基本信息
        map.put("name", this.name);

        // 第一季度数据
        map.put("honors_s1", this.honorsS1);
        map.put("commendations_s1", this.commendationsS1);
        map.put("integrity_s1", this.integrityS1);
        map.put("social_public_welfare_s1", this.socialPublicWelfareS1);
        map.put("professional_standards_s1", this.professionalStandardsS1);
        map.put("service_quality_s1", this.serviceQualityS1);
        map.put("evaluation_s1", this.evaluationS1);
        map.put("complaints_s1", this.complaintsS1);
        map.put("disciplinary_dis_s1", this.disciplinaryDisS1);
        map.put("disciplinary_honest_s1", this.disciplinaryHonestS1);
        map.put("disciplinary_car_s1", this.disciplinaryCarS1);
        map.put("training_study_s1", this.trainingStudyS1);
        map.put("training_triple_check_s1", this.trainingTripleCheckS1);
        map.put("meeting_s1", this.meetingS1);

        // 第二季度数据
        map.put("honors_s2", this.honorsS2);
        map.put("commendations_s2", this.commendationsS2);
        map.put("integrity_s2", this.integrityS2);
        map.put("social_public_welfare_s2", this.socialPublicWelfareS2);
        map.put("professional_standards_s2", this.professionalStandardsS2);
        map.put("service_quality_s2", this.serviceQualityS2);
        map.put("evaluation_s2", this.evaluationS2);
        map.put("complaints_s2", this.complaintsS2);
        map.put("disciplinary_dis_s2", this.disciplinaryDisS2);
        map.put("disciplinary_honest_s2", this.disciplinaryHonestS2);
        map.put("disciplinary_car_s2", this.disciplinaryCarS2);
        map.put("training_study_s2", this.trainingStudyS2);
        map.put("training_triple_check_s2", this.trainingTripleCheckS2);
        map.put("meeting_s2", this.meetingS2);

        // 第三季度数据
        map.put("honors_s3", this.honorsS3);
        map.put("commendations_s3", this.commendationsS3);
        map.put("integrity_s3", this.integrityS3);
        map.put("social_public_welfare_s3", this.socialPublicWelfareS3);
        map.put("professional_standards_s3", this.professionalStandardsS3);
        map.put("service_quality_s3", this.serviceQualityS3);
        map.put("evaluation_s3", this.evaluationS3);
        map.put("complaints_s3", this.complaintsS3);
        map.put("disciplinary_dis_s3", this.disciplinaryDisS3);
        map.put("disciplinary_honest_s3", this.disciplinaryHonestS3);
        map.put("disciplinary_car_s3", this.disciplinaryCarS3);
        map.put("training_study_s3", this.trainingStudyS3);
        map.put("training_triple_check_s3", this.trainingTripleCheckS3);
        map.put("meeting_s3", this.meetingS3);

        // 第四季度数据
        map.put("honors_s4", this.honorsS4);
        map.put("commendations_s4", this.commendationsS4);
        map.put("integrity_s4", this.integrityS4);
        map.put("social_public_welfare_s4", this.socialPublicWelfareS4);
        map.put("professional_standards_s4", this.professionalStandardsS4);
        map.put("service_quality_s4", this.serviceQualityS4);
        map.put("evaluation_s4", this.evaluationS4);
        map.put("complaints_s4", this.complaintsS4);
        map.put("disciplinary_dis_s4", this.disciplinaryDisS4);
        map.put("disciplinary_honest_s4", this.disciplinaryHonestS4);
        map.put("disciplinary_car_s4", this.disciplinaryCarS4);
        map.put("training_study_s4", this.trainingStudyS4);
        map.put("training_triple_check_s4", this.trainingTripleCheckS4);
        map.put("meeting_s4", this.meetingS4);

        // 计算各季度总分
        map.put("total_s1", calculateQuarterTotal(1));
        map.put("total_s2", calculateQuarterTotal(2));
        map.put("total_s3", calculateQuarterTotal(3));
        map.put("total_s4", calculateQuarterTotal(4));

        return map;
    }

    // 计算季度总分
    public Double calculateQuarterTotal(int quarter) {
        double baseScore = 80.0; // 个人基准分

        switch(quarter) {
            case 1:
                return baseScore +
                        (honorsS1 + commendationsS1 + integrityS1 + socialPublicWelfareS1) -
                        (Math.abs(professionalStandardsS1) + Math.abs(serviceQualityS1) +
                                Math.abs(evaluationS1) + Math.abs(complaintsS1) +
                                Math.abs(disciplinaryDisS1) + Math.abs(disciplinaryHonestS1) +
                                Math.abs(disciplinaryCarS1) + Math.abs(trainingStudyS1) +
                                Math.abs(trainingTripleCheckS1) + Math.abs(meetingS1));
            case 2:
                return baseScore +
                        (honorsS2 + commendationsS2 + integrityS2 + socialPublicWelfareS2) -
                        (Math.abs(professionalStandardsS2) + Math.abs(serviceQualityS2) +
                                Math.abs(evaluationS2) + Math.abs(complaintsS2) +
                                Math.abs(disciplinaryDisS2) + Math.abs(disciplinaryHonestS2) +
                                Math.abs(disciplinaryCarS2) + Math.abs(trainingStudyS2) +
                                Math.abs(trainingTripleCheckS2) + Math.abs(meetingS2));
            case 3:
                return baseScore +
                        (honorsS3 + commendationsS3 + integrityS3 + socialPublicWelfareS3) -
                        (Math.abs(professionalStandardsS3) + Math.abs(serviceQualityS3) +
                                Math.abs(evaluationS3) + Math.abs(complaintsS3) +
                                Math.abs(disciplinaryDisS3) + Math.abs(disciplinaryHonestS3) +
                                Math.abs(disciplinaryCarS3) + Math.abs(trainingStudyS3) +
                                Math.abs(trainingTripleCheckS3) + Math.abs(meetingS3));
            case 4:
                return baseScore +
                        (honorsS4 + commendationsS4 + integrityS4 + socialPublicWelfareS4) -
                        (Math.abs(professionalStandardsS4) + Math.abs(serviceQualityS4) +
                                Math.abs(evaluationS4) + Math.abs(complaintsS4) +
                                Math.abs(disciplinaryDisS4) + Math.abs(disciplinaryHonestS4) +
                                Math.abs(disciplinaryCarS4) + Math.abs(trainingStudyS4) +
                                Math.abs(trainingTripleCheckS4) + Math.abs(meetingS4));
            default:
                return baseScore;
        }
    }

    // 计算年度总分
    public Double calculateAnnualTotal() {
        this.totalScore = (calculateQuarterTotal(1) + calculateQuarterTotal(2) +
                calculateQuarterTotal(3) + calculateQuarterTotal(4)) / 4;
        return this.totalScore;
    }

    // 判断年度等级
    public String getAnnualLevel() {
        calculateAnnualTotal();
        if (totalScore >= 90) {
            return "优秀";
        } else if (totalScore >= 80) {
            return "良好";
        } else if (totalScore >= 65) {
            return "合格";
        } else {
            this.unqualified = true;
            return "不合格";
        }
    }

    // ========== Getter 和 Setter 方法 ==========

    // 基本信息
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // 第一季度
    public Double getHonorsS1() { return honorsS1; }
    public void setHonorsS1(Double honorsS1) { this.honorsS1 = honorsS1; }

    public Double getCommendationsS1() { return commendationsS1; }
    public void setCommendationsS1(Double commendationsS1) { this.commendationsS1 = commendationsS1; }

    public Double getIntegrityS1() { return integrityS1; }
    public void setIntegrityS1(Double integrityS1) { this.integrityS1 = integrityS1; }

    public Double getSocialPublicWelfareS1() { return socialPublicWelfareS1; }
    public void setSocialPublicWelfareS1(Double socialPublicWelfareS1) { this.socialPublicWelfareS1 = socialPublicWelfareS1; }

    public Double getProfessionalStandardsS1() { return professionalStandardsS1; }
    public void setProfessionalStandardsS1(Double professionalStandardsS1) { this.professionalStandardsS1 = professionalStandardsS1; }

    public Double getServiceQualityS1() { return serviceQualityS1; }
    public void setServiceQualityS1(Double serviceQualityS1) { this.serviceQualityS1 = serviceQualityS1; }

    public Double getEvaluationS1() { return evaluationS1; }
    public void setEvaluationS1(Double evaluationS1) { this.evaluationS1 = evaluationS1; }

    public Double getComplaintsS1() { return complaintsS1; }
    public void setComplaintsS1(Double complaintsS1) { this.complaintsS1 = complaintsS1; }

    public Double getDisciplinaryDisS1() { return disciplinaryDisS1; }
    public void setDisciplinaryDisS1(Double disciplinaryDisS1) { this.disciplinaryDisS1 = disciplinaryDisS1; }

    public Double getDisciplinaryHonestS1() { return disciplinaryHonestS1; }
    public void setDisciplinaryHonestS1(Double disciplinaryHonestS1) { this.disciplinaryHonestS1 = disciplinaryHonestS1; }

    public Double getDisciplinaryCarS1() { return disciplinaryCarS1; }
    public void setDisciplinaryCarS1(Double disciplinaryCarS1) { this.disciplinaryCarS1 = disciplinaryCarS1; }

    public Double getTrainingStudyS1() { return trainingStudyS1; }
    public void setTrainingStudyS1(Double trainingStudyS1) { this.trainingStudyS1 = trainingStudyS1; }

    public Double getTrainingTripleCheckS1() { return trainingTripleCheckS1; }
    public void setTrainingTripleCheckS1(Double trainingTripleCheckS1) { this.trainingTripleCheckS1 = trainingTripleCheckS1; }

    public Double getMeetingS1() { return meetingS1; }
    public void setMeetingS1(Double meetingS1) { this.meetingS1 = meetingS1; }

    // 第二季度（与第一季度类似的getter/setter）
    public Double getHonorsS2() { return honorsS2; }
    public void setHonorsS2(Double honorsS2) { this.honorsS2 = honorsS2; }

    public Double getCommendationsS2() { return commendationsS2; }
    public void setCommendationsS2(Double commendationsS2) { this.commendationsS2 = commendationsS2; }

    public Double getIntegrityS2() { return integrityS2; }
    public void setIntegrityS2(Double integrityS2) { this.integrityS2 = integrityS2; }

    public Double getSocialPublicWelfareS2() { return socialPublicWelfareS2; }
    public void setSocialPublicWelfareS2(Double socialPublicWelfareS2) { this.socialPublicWelfareS2 = socialPublicWelfareS2; }

    public Double getProfessionalStandardsS2() { return professionalStandardsS2; }
    public void setProfessionalStandardsS2(Double professionalStandardsS2) { this.professionalStandardsS2 = professionalStandardsS2; }

    public Double getServiceQualityS2() { return serviceQualityS2; }
    public void setServiceQualityS2(Double serviceQualityS2) { this.serviceQualityS2 = serviceQualityS2; }

    public Double getEvaluationS2() { return evaluationS2; }
    public void setEvaluationS2(Double evaluationS2) { this.evaluationS2 = evaluationS2; }

    public Double getComplaintsS2() { return complaintsS2; }
    public void setComplaintsS2(Double complaintsS2) { this.complaintsS2 = complaintsS2; }

    public Double getDisciplinaryDisS2() { return disciplinaryDisS2; }
    public void setDisciplinaryDisS2(Double disciplinaryDisS2) { this.disciplinaryDisS2 = disciplinaryDisS2; }

    public Double getDisciplinaryHonestS2() { return disciplinaryHonestS2; }
    public void setDisciplinaryHonestS2(Double disciplinaryHonestS2) { this.disciplinaryHonestS2 = disciplinaryHonestS2; }

    public Double getDisciplinaryCarS2() { return disciplinaryCarS2; }
    public void setDisciplinaryCarS2(Double disciplinaryCarS2) { this.disciplinaryCarS2 = disciplinaryCarS2; }

    public Double getTrainingStudyS2() { return trainingStudyS2; }
    public void setTrainingStudyS2(Double trainingStudyS2) { this.trainingStudyS2 = trainingStudyS2; }

    public Double getTrainingTripleCheckS2() { return trainingTripleCheckS2; }
    public void setTrainingTripleCheckS2(Double trainingTripleCheckS2) { this.trainingTripleCheckS2 = trainingTripleCheckS2; }

    public Double getMeetingS2() { return meetingS2; }
    public void setMeetingS2(Double meetingS2) { this.meetingS2 = meetingS2; }

    // 第三季度和第四季度的getter/setter类似，此处省略详细代码...
    // 为节省篇幅，这里只列出方法名，实际使用时需要补全

    public Double getHonorsS3() { return honorsS3; }
    public void setHonorsS3(Double honorsS3) { this.honorsS3 = honorsS3; }

    public Double getCommendationsS3() { return commendationsS3; }
    public void setCommendationsS3(Double commendationsS3) { this.commendationsS3 = commendationsS3; }

    // ... 第三季度其他字段的getter/setter

    public Double getHonorsS4() { return honorsS4; }
    public void setHonorsS4(Double honorsS4) { this.honorsS4 = honorsS4; }

    public Double getCommendationsS4() { return commendationsS4; }
    public void setCommendationsS4(Double commendationsS4) { this.commendationsS4 = commendationsS4; }

    // ... 第四季度其他字段的getter/setter

    // 年度信息
    public Double getTotalScore() { return totalScore; }
    public void setTotalScore(Double totalScore) { this.totalScore = totalScore; }

    public Boolean getUnqualified() { return unqualified; }
    public void setUnqualified(Boolean unqualified) { this.unqualified = unqualified; }

    @Override
    public String toString() {
        return "MedicalEthicsData{" +
                "name='" + name + '\'' +
                ", 第一季度总分=" + calculateQuarterTotal(1) +
                ", 第二季度总分=" + calculateQuarterTotal(2) +
                ", 第三季度总分=" + calculateQuarterTotal(3) +
                ", 第四季度总分=" + calculateQuarterTotal(4) +
                ", 年度总分=" + calculateAnnualTotal() +
                ", 年度等级='" + getAnnualLevel() + '\'' +
                '}';
    }

    public static void fillSingleEmployee(HttpServletResponse response,String templatePath, String outputPath, MedicalEthicsData data) throws IOException {
        Map<String, Object> fillMap = data.toFillMap();

        FastExcel.write(response.getOutputStream())
                .withTemplate(templatePath)
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .sheet("考核表")
                .doFill(fillMap);
    }

    /**
     * 使用示例数据填充Excel
     */
    public static MedicalEthicsData createSampleData(String employeeName) {
        MedicalEthicsData data = new MedicalEthicsData(employeeName);

        // 第一季度示例数据
        data.setHonorsS1(5.0);           // 市级荣誉
        data.setCommendationsS1(1.0);    // 卫健委媒体表扬
        data.setIntegrityS1(2.0);        // 拒收红包
        data.setSocialPublicWelfareS1(1.0); // 志愿者活动
        data.setServiceQualityS1(-2.0);  // 违反医疗常规
        data.setTrainingTripleCheckS1(-2.0); // 三基考核不合格

        // 第二季度示例数据
        data.setHonorsS2(3.0);           // 区级荣誉
        data.setCommendationsS2(0.5);    // 表扬信
        data.setSocialPublicWelfareS2(5.0); // 参加突发事件
        data.setComplaintsS2(-3.0);      // 有效服务类投诉

        // 第三季度示例数据
        data.setHonorsS3(1.0);           // 院级荣誉
//        data.setIntegrityS3(2.0);        // 拒收红包
//        data.setDisciplinaryDisS3(-2.0); // 无故迟到
//        data.setMeetingS3(-1.0);         // 重要会议缺席

        // 第四季度示例数据
        data.setCommendationsS4(5.0);    // 市级以上媒体表扬
//        data.setProfessionalStandardsS4(-5.0); // 违反从业规范
//        data.setEvaluationS4(-2.0);      // 检查中不配合

        return data;
    }
}
