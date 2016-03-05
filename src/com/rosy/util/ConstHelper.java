
package com.rosy.util;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class ConstHelper implements Serializable {
    public final static String DATA_APPEND = "append";

    public static final String DATA_UPDATE = "update";

    private static ConstHelper constHelper = null;

    private List routeLevelCodeList;// ·�ߵȼ�����

    private List routeLevelDescList;// ·�ߵȼ�����

    private String routeLevelCode;// ·�ߵȼ��ڵ�

    private Map routeLevelNodeMap;

    // ������
    private List<String> administrativeCodeList;

    private List<String> administrativeDescList;

    private Map<String, String> administrativeNodeMap;

    private String administrativeTypeCode;// ADMINISTRATIVE

    // <DEPARTMENT_LIST desc="������">
    private List<String> departmentCodeList;

    private List<String> departmentDescList;

    private Map<String, String> departmentNodeMap;

    private String departmentTypeCode;// <DEPARTMENT_LIST desc="������">

    // <POSITION_LIST desc="����ְλ">
    private List<String> positionCodeList;

    private List<String> positionDescList;

    private Map<String, String> positionNodeMap;

    private String positionTypeCode;// <POSITION_LIST desc="����ְλ">

    // ·������
    private List<String> roadTypeCodeList;

    private List<String> roadTypeDescList;

    private Map<String, String> roadTypeNodeMap;

    private String raodTypeCode;// ROAD_TYPE

    // �����Ϣ���еĵ�鷽��
    private List<String> directionCodeList;

    private List<String> directionDescList;

    private Map<String, String> directionNodeMap;

    private String direction;// ROAD_TYPE

    // ·������
    private List<String> checkTypeCodeList;

    private List<String> checkTypeDescList;

    private Map<String, String> checkTypeNodeMap;

    private String checkType;// CHECK_TYPE

    // Ȩ��ģ��
    private List<String> rightModuleCodeList;

    private List<String> rightModuleDescList;

    private Map<String, String> rightModuleNodeMap;

    private String rightModule;// RIGHT_MODULE

    // ·�������
    private List<String> roadRightModuleCodeList;

    private List<String> roadRightModuleDescList;

    private Map<String, String> roadRightModuleNodeMap;

    private String roadRightModule;// ROAD_RIGHT_MODULE

    // ͳ�Ʊ���
    private List<String> statRightModuleCodeList;

    private List<String> statRightModuleDescList;

    private Map<String, String> statRightModuleNodeMap;

    private String statRightModule;// STAT_RIGHT_MODULE

    // ϵͳ����
    private List<String> systemRightModuleCodeList;

    private List<String> systemRightModuleDescList;

    private Map<String, String> systemRightModuleNodeMap;

    private String systemRightModule;// SYSTEM_RIGHT_MODULE

    //·�ߵȼ�
    private List<String> roadLevelCodeList;
    private List<String> roadLevelDescList;
    private Map<String,String> roadLevelNodeMap;
    private String roadLevel;
    
    public List<String> getRoadLevelCodeList() {
		return roadLevelCodeList;
	}

	public void setRoadLevelCodeList(List<String> roadLevelCodeList) {
		this.roadLevelCodeList = roadLevelCodeList;
	}

	public List<String> getRoadLevelDescList() {
		return roadLevelDescList;
	}

	public void setRoadLevelDescList(List<String> roadLevelDescList) {
		this.roadLevelDescList = roadLevelDescList;
	}

	public Map<String, String> getRoadLevelNodeMap() {
		return roadLevelNodeMap;
	}

	public void setRoadLevelNodeMap(Map<String, String> roadLevelNodeMap) {
		this.roadLevelNodeMap = roadLevelNodeMap;
	}

	public String getRoadLevel() {
		return roadLevel;
	}

	public void setRoadLevel(String roadLevel) {
		this.roadLevel = roadLevel;
	}

	private ConstHelper() {
        XMLConfigUtil.init((XMLConfigUtil.class).getResource("/basicData.xml")
                .getFile());
        // System.out.println((XMLConfigUtil.class).getResource("/basicData.xml").getFile());

        // <!-- ·�ߵȼ�-->
        XMLConfigUtil configUtil = XMLConfigUtil.getClassNode("ROUTE_LEVEL");
        this.setRouteLevelCodeList(configUtil.getCodeList());
        this.setRouteLevelDescList(configUtil.getDescList());
        this.setRouteLevelNodeMap(configUtil.getNodeMap());

        // ����
        configUtil = XMLConfigUtil.getClassNode("ADMINISTRATIVE");
        this.setAdministrativeCodeList(configUtil.getCodeList());
        this.setAdministrativeDescList(configUtil.getDescList());
        this.setAdministrativeNodeMap(configUtil.getNodeMap());

        // ·������
        configUtil = XMLConfigUtil.getClassNode("ROAD_TYPE");
        this.setRoadTypeCodeList(configUtil.getCodeList());
        this.setRoadTypeDescList(configUtil.getDescList());
        this.setRoadTypeNodeMap(configUtil.getNodeMap());

        // �����Ϣ���еĵ�鷽��
        configUtil = XMLConfigUtil.getClassNode("CHECK_MAIN_DIRECTION");
        this.setDirectionCodeList(configUtil.getCodeList());
        this.setDirectionDescList(configUtil.getDescList());
        this.setDirectionNodeMap(configUtil.getNodeMap());

        //
        configUtil = XMLConfigUtil.getClassNode("DEPARTMENT_LIST");
        this.setDepartmentCodeList(configUtil.getCodeList());
        this.setDepartmentDescList(configUtil.getDescList());
        this.setDepartmentNodeMap(configUtil.getNodeMap());

        //
        configUtil = XMLConfigUtil.getClassNode("POSITION_LIST");
        this.setPositionCodeList(configUtil.getCodeList());
        this.setPositionDescList(configUtil.getDescList());
        this.setPositionNodeMap(configUtil.getNodeMap());

        // ·������
        configUtil = XMLConfigUtil.getClassNode("CHECK_TYPE");
        this.setCheckTypeCodeList(configUtil.getCodeList());
        this.setCheckTypeDescList(configUtil.getDescList());
        this.setCheckTypeNodeMap(configUtil.getNodeMap());
        

        //  <RIGHT_MODULE desc="Ȩ��ģ��">
        configUtil= XMLConfigUtil.getClassNode("RIGHT_MODULE");
        this.setRightModuleCodeList(configUtil.getCodeList());
        this.setRightModuleDescList(configUtil.getDescList());
        this.setRightModuleNodeMap(configUtil.getNodeMap());

        //    <ROAD_RIGHT_MODULE desc="·�������">
        configUtil= XMLConfigUtil.getClassNode("ROAD_RIGHT_MODULE");
        this.setRoadRightModuleCodeList(configUtil.getCodeList());
        this.setRoadRightModuleDescList(configUtil.getDescList());
        this.setRoadRightModuleNodeMap(configUtil.getNodeMap());

        //   <STAT_RIGHT_MODULE desc="ͳ�Ʊ���">
        configUtil= XMLConfigUtil.getClassNode("STAT_RIGHT_MODULE");
        this.setStatRightModuleCodeList(configUtil.getCodeList());
        this.setStatRightModuleDescList(configUtil.getDescList());
        this.setStatRightModuleNodeMap(configUtil.getNodeMap());

        //        <SYSTEM_RIGHT_MODULE desc="ϵͳ����">
        configUtil= XMLConfigUtil.getClassNode("SYSTEM_RIGHT_MODULE");
        this.setSystemRightModuleCodeList(configUtil.getCodeList());
        this.setSystemRightModuleDescList(configUtil.getDescList());
        this.setSystemRightModuleNodeMap(configUtil.getNodeMap());
        
        //·�ߵȼ�
        configUtil = XMLConfigUtil.getClassNode("ROAD_LEVEL");
        this.setRoadLevelCodeList(configUtil.getCodeList());
        this.setRoadLevelDescList(configUtil.getDescList());
        this.setRoadLevelNodeMap(configUtil.getNodeMap());
        
        // //more �μ�main�������Զ����dangerBirdgeCodeList
        // configUtil= XMLConfigUtil.getClassNode("");
        // this.setBridgeCodeList(configUtil.getCodeList());
        // this.setBridgeDescList(configUtil.getDescList());
        // this.setBridgeNodeMap(configUtil.getNodeMap());

        // List list=XMLConfigUtil.getCodeList();
        // for(Iterator it = map.entrySet().iterator(); it.hasNext(); ){
        // Map.Entry e = (Map.Entry)it.next();
        // System.out.println("key: " + e.getKey());
        // System.out.println("value: " + e.getValue());
        // }
        // for(int i=0;i<list.size();i++)
        // System.out.println(list.get(i));;

    }

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        ConstHelper constHelper = new ConstHelper();

        Method[] method = ConstHelper.class.getMethods();
        int j = 0;
        for (int i = 0; i < method.length; i++) {
            String str = method[i].getName();
            if (str.startsWith("set")) {

                if (str.endsWith("CodeList")) {
                    System.out.println("");
                    System.out.println("//");
                    System.out
                            .println("configUtil= XMLConfigUtil.getClassNode(\"\");");
                    System.out.println("this." + str
                            + "(configUtil.getCodeList());");
                } else if (str.endsWith("DescList")) {
                    System.out.println("this." + str
                            + "(configUtil.getDescList());");
                } else if (str.endsWith("NodeMap")) {
                    System.out.println("this." + str
                            + "(configUtil.getNodeMap());");
                }
            }

        }

    }

    public static ConstHelper getConstHelper() {
        if (constHelper == null) {
            constHelper = new ConstHelper();

        }
        return constHelper;
    }

    /**
     * @param args
     */

    public String getDescByCode(String code, String node) {
        XMLConfigUtil configUtil = XMLConfigUtil.getClassNode(node);
        return (String) configUtil.getNodeMap().get(code);
    }

    public List getRouteLevelCodeList() {
        return routeLevelCodeList;
    }

    public void setRouteLevelCodeList(List routeLevelCodeList) {
        this.routeLevelCodeList = routeLevelCodeList;
    }

    public List getRouteLevelDescList() {
        return routeLevelDescList;
    }

    public void setRouteLevelDescList(List routeLevelDescList) {
        this.routeLevelDescList = routeLevelDescList;
    }

    public String getRouteLevelCode() {
        return routeLevelCode;
    }

    public void setRouteLevelCode(String routeLevelCode) {
        this.routeLevelCode = routeLevelCode;
    }

    public Map getRouteLevelNodeMap() {
        return routeLevelNodeMap;
    }

    public void setRouteLevelNodeMap(Map routeLevelNodeMap) {
        this.routeLevelNodeMap = routeLevelNodeMap;
    }

    public List<String> getAdministrativeCodeList() {
        return administrativeCodeList;
    }

    public void setAdministrativeCodeList(List<String> administrativeCodeList) {
        this.administrativeCodeList = administrativeCodeList;
    }

    public List<String> getAdministrativeDescList() {
        return administrativeDescList;
    }

    public void setAdministrativeDescList(List<String> administrativeDescList) {
        this.administrativeDescList = administrativeDescList;
    }

    public Map<String, String> getAdministrativeNodeMap() {
        return administrativeNodeMap;
    }

    public void setAdministrativeNodeMap(
            Map<String, String> administrativeNodeMap) {
        this.administrativeNodeMap = administrativeNodeMap;
    }

    public String getAdministrativeTypeCode() {
        return administrativeTypeCode;
    }

    public void setAdministrativeTypeCode(String administrativeTypeCode) {
        this.administrativeTypeCode = administrativeTypeCode;
    }

    public List<String> getRoadTypeCodeList() {
        return roadTypeCodeList;
    }

    public void setRoadTypeCodeList(List<String> roadTypeCodeList) {
        this.roadTypeCodeList = roadTypeCodeList;
    }

    public List<String> getRoadTypeDescList() {
        return roadTypeDescList;
    }

    public void setRoadTypeDescList(List<String> roadTypeDescList) {
        this.roadTypeDescList = roadTypeDescList;
    }

    public Map<String, String> getRoadTypeNodeMap() {
        return roadTypeNodeMap;
    }

    public void setRoadTypeNodeMap(Map<String, String> roadTypeNodeMap) {
        this.roadTypeNodeMap = roadTypeNodeMap;
    }

    public String getRaodTypeCode() {
        return raodTypeCode;
    }

    public void setRaodTypeCode(String raodTypeCode) {
        this.raodTypeCode = raodTypeCode;
    }

    public List<String> getDepartmentCodeList() {
        return departmentCodeList;
    }

    public void setDepartmentCodeList(List<String> departmentCodeList) {
        this.departmentCodeList = departmentCodeList;
    }

    public List<String> getDepartmentDescList() {
        return departmentDescList;
    }

    public void setDepartmentDescList(List<String> departmentDescList) {
        this.departmentDescList = departmentDescList;
    }

    public Map<String, String> getDepartmentNodeMap() {
        return departmentNodeMap;
    }

    public void setDepartmentNodeMap(Map<String, String> departmentNodeMap) {
        this.departmentNodeMap = departmentNodeMap;
    }

    public String getDepartmentTypeCode() {
        return departmentTypeCode;
    }

    public void setDepartmentTypeCode(String departmentTypeCode) {
        this.departmentTypeCode = departmentTypeCode;
    }

    public List<String> getPositionCodeList() {
        return positionCodeList;
    }

    public void setPositionCodeList(List<String> positionCodeList) {
        this.positionCodeList = positionCodeList;
    }

    public List<String> getPositionDescList() {
        return positionDescList;
    }

    public void setPositionDescList(List<String> positionDescList) {
        this.positionDescList = positionDescList;
    }

    public Map<String, String> getPositionNodeMap() {
        return positionNodeMap;
    }

    public void setPositionNodeMap(Map<String, String> positionNodeMap) {
        this.positionNodeMap = positionNodeMap;
    }

    public String getPositionTypeCode() {
        return positionTypeCode;
    }

    public void setPositionTypeCode(String positionTypeCode) {
        this.positionTypeCode = positionTypeCode;
    }

    public List<String> getDirectionCodeList() {
        return directionCodeList;
    }

    public void setDirectionCodeList(List<String> directionCodeList) {
        this.directionCodeList = directionCodeList;
    }

    public List<String> getDirectionDescList() {
        return directionDescList;
    }

    public void setDirectionDescList(List<String> directionDescList) {
        this.directionDescList = directionDescList;
    }

    public Map<String, String> getDirectionNodeMap() {
        return directionNodeMap;
    }

    public void setDirectionNodeMap(Map<String, String> directionNodeMap) {
        this.directionNodeMap = directionNodeMap;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public List<String> getCheckTypeCodeList() {
        return checkTypeCodeList;
    }

    public void setCheckTypeCodeList(List<String> checkTypeCodeList) {
        this.checkTypeCodeList = checkTypeCodeList;
    }

    public List<String> getCheckTypeDescList() {
        return checkTypeDescList;
    }

    public void setCheckTypeDescList(List<String> checkTypeDescList) {
        this.checkTypeDescList = checkTypeDescList;
    }

    public Map<String, String> getCheckTypeNodeMap() {
        return checkTypeNodeMap;
    }

    public void setCheckTypeNodeMap(Map<String, String> checkTypeNodeMap) {
        this.checkTypeNodeMap = checkTypeNodeMap;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public List<String> getRightModuleCodeList() {
        return rightModuleCodeList;
    }

    public void setRightModuleCodeList(List<String> rightModuleCodeList) {
        this.rightModuleCodeList = rightModuleCodeList;
    }

    public List<String> getRightModuleDescList() {
        return rightModuleDescList;
    }

    public void setRightModuleDescList(List<String> rightModuleDescList) {
        this.rightModuleDescList = rightModuleDescList;
    }

    public Map<String, String> getRightModuleNodeMap() {
        return rightModuleNodeMap;
    }

    public void setRightModuleNodeMap(Map<String, String> rightModuleNodeMap) {
        this.rightModuleNodeMap = rightModuleNodeMap;
    }

    public String getRightModule() {
        return rightModule;
    }

    public void setRightModule(String rightModule) {
        this.rightModule = rightModule;
    }

    public List<String> getRoadRightModuleCodeList() {
        return roadRightModuleCodeList;
    }

    public void setRoadRightModuleCodeList(List<String> roadRightModuleCodeList) {
        this.roadRightModuleCodeList = roadRightModuleCodeList;
    }

    public List<String> getRoadRightModuleDescList() {
        return roadRightModuleDescList;
    }

    public void setRoadRightModuleDescList(List<String> roadRightModuleDescList) {
        this.roadRightModuleDescList = roadRightModuleDescList;
    }

    public Map<String, String> getRoadRightModuleNodeMap() {
        return roadRightModuleNodeMap;
    }

    public void setRoadRightModuleNodeMap(Map<String, String> roadRightModuleNodeMap) {
        this.roadRightModuleNodeMap = roadRightModuleNodeMap;
    }

    public String getRoadRightModule() {
        return roadRightModule;
    }

    public void setRoadRightModule(String roadRightModule) {
        this.roadRightModule = roadRightModule;
    }

    public List<String> getStatRightModuleCodeList() {
        return statRightModuleCodeList;
    }

    public void setStatRightModuleCodeList(List<String> statRightModuleCodeList) {
        this.statRightModuleCodeList = statRightModuleCodeList;
    }

    public List<String> getStatRightModuleDescList() {
        return statRightModuleDescList;
    }

    public void setStatRightModuleDescList(List<String> statRightModuleDescList) {
        this.statRightModuleDescList = statRightModuleDescList;
    }

    public Map<String, String> getStatRightModuleNodeMap() {
        return statRightModuleNodeMap;
    }

    public void setStatRightModuleNodeMap(Map<String, String> statRightModuleNodeMap) {
        this.statRightModuleNodeMap = statRightModuleNodeMap;
    }

    public String getStatRightModule() {
        return statRightModule;
    }

    public void setStatRightModule(String statRightModule) {
        this.statRightModule = statRightModule;
    }

    public List<String> getSystemRightModuleCodeList() {
        return systemRightModuleCodeList;
    }

    public void setSystemRightModuleCodeList(List<String> systemRightModuleCodeList) {
        this.systemRightModuleCodeList = systemRightModuleCodeList;
    }

    public List<String> getSystemRightModuleDescList() {
        return systemRightModuleDescList;
    }

    public void setSystemRightModuleDescList(List<String> systemRightModuleDescList) {
        this.systemRightModuleDescList = systemRightModuleDescList;
    }

    public Map<String, String> getSystemRightModuleNodeMap() {
        return systemRightModuleNodeMap;
    }

    public void setSystemRightModuleNodeMap(
            Map<String, String> systemRightModuleNodeMap) {
        this.systemRightModuleNodeMap = systemRightModuleNodeMap;
    }

    public String getSystemRightModule() {
        return systemRightModule;
    }

    public void setSystemRightModule(String systemRightModule) {
        this.systemRightModule = systemRightModule;
    }

}
