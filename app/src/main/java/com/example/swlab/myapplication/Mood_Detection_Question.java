package com.example.swlab.myapplication;

/**
 * Created by Owner on 2017/5/22.
 */

public class Mood_Detection_Question {

    private String textQuestions []={
            "1. 我常常覺得想哭",
            "2. 我覺得心情不好",
            "3. 我覺得比以前容易發脾氣",
            "4. 我睡不好",
            "5. 我覺得不想吃東西",
            "6. 我覺得胸口悶悶的 ( 心肝頭或胸坎綁綁 )",
            "7. 我覺得不輕鬆、不舒服 ( 不爽快 )",
            "8. 我覺得身體疲勞虛弱、無力 ( 身體很虛、沒力氣、元氣及體力 )",
            "9. 我覺得很煩",
            "10. 我覺得記憶力不好",
            "11. 我覺得做事時無法專心",
            "12. 我覺得想事情或做事時，比平常要緩慢",
            "13. 我覺得比以前較沒信心",
            "14. 我覺得比較會往壞處想",
            "15. 我覺得想不開、甚至想死",
            "16. 我覺得對什麼事都失去興趣",
            "17. 我覺得身體不舒服 ( 如頭痛、頭暈、心悸或肚子不舒服…等 )",
            "18. 我覺得自己很沒用"
    };

    private  String multipleChoice [][] ={
            {"沒有或極少 (每周: 1天以下)", "有時侯 (每周: 1～2天)", "時常 (每周: 3～4天)", "常常或總是 (每周: 5～7天)"},
            {"沒有或極少 (每周: 1天以下)", "有時侯 (每周: 1～2天)", "時常 (每周: 3～4天)", "常常或總是 (每周: 5～7天)"},
            {"沒有或極少 (每周: 1天以下)", "有時侯 (每周: 1～2天)", "時常 (每周: 3～4天)", "常常或總是 (每周: 5～7天)"},
            {"沒有或極少 (每周: 1天以下)", "有時侯 (每周: 1～2天)", "時常 (每周: 3～4天)", "常常或總是 (每周: 5～7天)"},
            {"沒有或極少 (每周: 1天以下)", "有時侯 (每周: 1～2天)", "時常 (每周: 3～4天)", "常常或總是 (每周: 5～7天)"}
    };

    public int getLength() {return textQuestions.length; }

    public String getQuestion(int a){
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num){
        String choice0 = multipleChoice[index] [num-1];
        return choice0;
    }
}
