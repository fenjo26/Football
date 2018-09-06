package jkjew.kjjeh.kddddh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import jkjew.kjjeh.kddddh.lalaa.Se2cds;

public class Firsdcsdkmcq extends BaseMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.qweqwdq);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Firsdcsdkmcq.this, Se2cds.class));
            }
        });
        setView("Головкина лишили чемпионского пояса",
                R.drawable.dewsa,
                "Боксер Геннадий Головкин лишился титула чемпиона мира по версии Международной боксерской федерации (IBF). Он остался обладателем поясов по версиям Всемирной боксерской ассоциации (WBA), Международной боксерской организации (IBO) и Всемирного боксерского совета (WBC). Об этом сообщает BoxingScene.\n" +
                        "\n" +
                        "Спортсмен отказался от боя с обязательным претендентом на титул украинцем Сергеем Деревянченко, который должен был пройти до 3 августа. Пояс по версии IBF останется вакантным, организация в ближайшее время выберет двух претендентов на него.\n" +
                        "\n" +
                        "Головкин собирался выполнить свои обязательства 5 марта в бою с Саулем Альваресом, однако незадолго до их поединка мексиканец сдал положительную допинг-пробу. В его анализах был обнаружен запрещенный препарат кленбутерол. Сообщалось, что вещество попало в организм спортсмена с зараженным мясом, из-за которого в последние годы пострадали десятки мексиканских спортсменов.\n" +
                        "\n" +
                        "В активе казахстанского боксера 37 побед, из которых 33 — нокаутом, и одна ничья. Альварес же за профессиональную карьеру провел 52 поединка — 49 побед, из которых 34 нокаутом, одно поражение и две ничьи.");
    }
}
