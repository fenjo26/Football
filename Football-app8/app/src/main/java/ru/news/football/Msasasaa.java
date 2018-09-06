package ru.news.football;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ru.news.football.qweqw.Cdsksd;

public class Msasasaa extends Ooosaa {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oikwqdoik);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msasasaa.this, Cdsksd.class));
            }
        });
        setView("Киберспортсмен станет пилотом «Формулы-1»",
                R.drawable.f1,
                "Победивший в финале международного киберспортивного первенства World's Fastest Gamer голландец Руди ван Бюрен станет тестовым пилотом команды «Формулы-1» McLaren. Об этом сообщаетcя на сайте команды.\n" +
                        "\n" +
                        "«Каждый мальчик, который начинает гоняться в картинге, мечтает о \"Формуле-1\". Теперь, когда я выиграл титул World’s Fastest Gamer, я могу заново пережить эту мечту», — сказал киберспортсмен.\n" +
                        "\n" +
                        "Ван Бюрен рассказал, что для него происходящее — непередаваемый опыт: «Нельзя описать словами, что я чувствую сейчас. Впервые я приехал в Технологический центр McLaren на прошлой неделе, а сегодня уезжаю отсюда в качестве нового сотрудника — это потрясающе».\n" +
                        "\n" +
                        "Спортсмен 21 ноября прошел финальное четырехчасовое испытание на симуляторе «Формулы-1», одолев 11 соперников. Всего в соревнованиях приняли участие более 30 тысяч киберспортсменов.\n" +
                        "\n" +
                        "Голландец станет тестовым пилотом команды McLaren в 2018 году. В его обязанности будет входить работа на симуляторе. На данный момент киберспортсмен работает менеджером по продажам.");
    }
}
