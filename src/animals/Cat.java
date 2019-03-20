package animals;

public class Cat {

    private String name;
    private int age;
    private String furColour;

    public Cat(String name, int age, String furColour){
        this.name = name;
        this.age = age;
        this.furColour = furColour;
    }

    public String play(int age){
        String playing = "";
        switch (age){
            case 1:
                playing = "Let's play!!";
                break;
            case 2:
                playing = "If you insist, I can play for a bit";
                break;
            default:
                playing = "Not in the mood, I'm too old for this";
                break;

        }

        return playing;
    }

    public String beHuman(String name, int age, String furColour){
        return "Hello human, I'm " + name + " and I'm a " + age + " year old cat. My fur is " + furColour + "!";
    }



}
