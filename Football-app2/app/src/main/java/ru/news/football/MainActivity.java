package raft.atlant.ylen.kz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import raft.atlant.ylen.kz.pages.Class2;

public class MainActivity extends BasePage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Class2.class));
            }
        });
        setView("«Зенит» вернет Дзюбу",
                R.drawable.qwegrirefierfker,
                "Нападающий сборной России Артем Дзюба, в минувшем сезоне выступавший за тульский «Арсенал» на правах аренды, вернется в петербургский «Зенит». Об этом главный тренер команды Сергей Семак сообщил в интервью «Матч ТВ».\n" +
                        "\n" +
                        "«Никаких вопросов нет, только если у него что-то изменится. Я жду Артема в команде. Мы общались, готовы работать во благо команды. Он должен делать максимум со своей стороны, я — со своей. Так что он возвращается», — сказал Семак. Он также добавил, что на чемпионате мира Дзюба делает все, чтобы прибавлять от игры к игре.\n" +
                        "\n" +
                        "29 мая на официальном сайте «Зенита» появилась информация о назначении Семака главным тренером команды. Соглашение специалиста с сине-бело-голубыми рассчитано на два года с возможностью продления еще на год.\n" +
                        "\n" +
                        "Дзюба подписал контракт с «Зенитом» в феврале 2016 года. За два сезона в 43 матчах Российской футбольной премьер-лиги он забил 14 голов. В начале 2018-го нападающий на правах аренды перешел в тульский «Арсенал». На его счету шесть мячей в десяти играх.\n" +
                        "\n" +
                        "На данный момент футболист выступает на чемпионате мира по футболу в составе сборной России. В четырех матчах он забил три гола и отдал одну результативную передачу.\n" +
                        "\n");
    }
}
