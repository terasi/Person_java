public class Test {

    public static void main(String[] args) {
        
        Person taro=new Person();
        taro.name="山田太郎";
        taro.age=20;
        taro.phoneNumber="080-0000-0000";
        taro.address="taro@gmail.com";

        System.out.println(taro.name);
        System.out.println(taro.age);
        System.out.println(taro.phoneNumber);
        System.out.println(taro.address);
        taro.talk();
        taro.walk();
        taro.run();

        Person ziro=new Person();
        ziro.name="木村次郎";
        ziro.age=18;
        ziro.phoneNumber="080-0000-0000";
        ziro.address="ziro@gmail.com";

        System.out.println(ziro.name);
        System.out.println(ziro.age);
        System.out.println(ziro.phoneNumber);
        System.out.println(ziro.address);

        Person hanako=new Person();
        hanako.name="鈴木花子";
        hanako.age=16;
        hanako.phoneNumber="080-0000-0000";
        hanako.address="hanako@gmail.com";

        System.out.println(hanako.name);
        System.out.println(hanako.age);
        System.out.println(hanako.phoneNumber);
        System.out.println(hanako.address);

        Person hiroto=new Person();
        hiroto.name="寺島滉人";
        hiroto.age=27;
        hiroto.phoneNumber="080-0000-0000";
        hiroto.address="hiroto@gmail.com";

        System.out.println(hiroto.name);
        System.out.println(hiroto.age);
        System.out.println(hiroto.phoneNumber);
        System.out.println(hiroto.address);

    }

}
