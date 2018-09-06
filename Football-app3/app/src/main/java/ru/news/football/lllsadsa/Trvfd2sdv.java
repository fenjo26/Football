package sehrg.jyttttt.jher.yyyyy.lllsadsa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import sehrg.jyttttt.jher.yyyyy.GfsdsdckABSes;
import sehrg.jyttttt.jher.yyyyy.R;

public class Trvfd2sdv extends GfsdsdckABSes {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onNormalResume();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Trvfd2sdv.this, NefdsfAewefEDD.class));
            }
        });
        setView("Аршавин оценил шансы сборной России на победу на ЧМ",
                R.drawable.ytytye,
                "Полузащитник казахстанского «Кайрата» Андрей Аршавин оценил шансы сборной России на победу на домашнем чемпионате мира. Слова спортсмена приводит портал zakon.kz.\n" +
                        "\n" +
                        "«У россиян самые низкие шансы среди оставшихся участников. Но все возможно. Если Россия смогла победить Испанию, может быть они смогут одолеть и других соперников. Я думаю, что Хорватия очень сильный и серьезный соперник, показывает очень сбалансированный футбол, и сборной России будет так же трудно, как и в предыдущей игре против Испании», — сказал игрок.\n" +
                        "\n" +
                        "Рассуждая о причинах успеха сборной России, Аршавин отметил, что команда хорошо готова физически, играет дисциплинированно, а также получает «сумасшедшую поддержку» болельщиков.\n" +
                        "\n" +
                        "1 июля сборная России в матче 1/8 финала мундиаля обыграла команду Испании. Основное и дополнительное время завершилось со счетом 1:1, в серии пенальти победили хозяева благодаря двум сейвам Игоря Акинфеева. В четвертьфинале россияне встретятся с Хорватией.\n" +
                        "\n" +
                        "Чемпионат мира проходит с 14 июня по 15 июля в 11 городах России."
        );
    }
}
