package ch08;

public class HumanInfo {
    // TODO: 2022/12/07 "키가 180이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세 입니다."

    public int weight;
    public int height;

    public String sex;

    public String humanName;
    public int age;


    public HumanInfo(int weight, int height, String sex,String humanName, int age){
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.humanName = humanName;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("키가" + height + "이고 몸무게가 " + weight + " 킬로인"+ sex +"이 있습니다. 이름은 " + humanName + " 이고 나이는 " + age + "세 입니다.");
    }


}
