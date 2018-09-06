package raft.atlant.ylen.kz.pages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import raft.atlant.ylen.kz.BasePage;
import raft.atlant.ylen.kz.R;

public class Class2 extends BasePage {

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
                startActivity(new Intent(Class2.this, TherdArticleNews.class));
            }
        });
        setView("Вылетевших с ЧМ колумбийцев пообещали убить",
                R.drawable.iiiiururc,
"Игроки сборной Колумбии Матеус Урибе и Карлос Бакка получили смертельные угрозы от пользователей социальных сетей после вылета команды с чемпионата мира по футболу. Посты опубликованы в Twitter.\n" +
        "\n" +
        "Колумбийцы не советуют футболистам возвращаться на родину, угрожая расправой за нереализованные пенальти в послематчевой серии. Урибе попал в перекладину, а удар Бакки парировал вратарь англичан Джордан Пикфорд.\n" +
        "\n" +
        "3 июля сборная Англии переиграла колумбийцев в матче 1/8 финала чемпионата мира. В основное и дополнительное время команды победителя не выявили (1:1), в серии пенальти англичане оказались сильнее — 4:3. Команда Гарета Саутгейта пробилась в четвертьфинал турнира, где 7 июля сыграет со шведами. Матч начнется в 17:00 по московскому времени.\n" +
        "\n" +
        "2 июля исполнилось 24 года со дня смерти бывшего защитника сборной Колумбии Андреса Эскобара, который был застрелен по возвращении на родину с ЧМ-1994 в США. Его автогол в матче с хозяевами турнира не позволил колумбийцам выйти из группы."        );
    }
}
