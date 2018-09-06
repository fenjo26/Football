package dzvon.dzvonechku.sokoly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dzvon.dzvonechku.sokoly.soookc.Kadd2;

public class Main23223cdsdc extends Glavsddkl {

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
                startActivity(new Intent(Main23223cdsdc.this, Kadd2.class));
            }
        });
        setView("Илья Ковальчук вернулся в НХЛ",
                R.drawable.hocqqwwq,
                "Бывший нападающий санкт-петербургского СКА Илья Ковальчук станет игроком клуба Национальной хоккейной лиги (НХЛ) «Лос-Анджелес Кингз». Об этом сообщается в Twitter-аккаунте команды.\n" +
                        "\n" +
                        "Спортсмен присоединится к команде перед стартом сезона-2018/2019, когда будут улажены все детали трехлетнего контракта. Официально договор будет подписан 1 июля.\n" +
                        "\n" +
                        "В начале апреля Ковальчук объявил, что уходит из петербургского СКА и собирается вернуться в НХЛ. Россиянин перешел в СКА из «Нью-Джерси» летом 2013 года. В составе петербургского клуба нападающий выиграл Кубок Гагарина.\n" +
                        "\n" +
                        "Помимо «Нью-Джерси», в НХЛ россиянин также защищал цвета «Атланта Трэшерз». Проведя в США суммарно 12 сезонов, Ковальчук так и не стал обладателем Кубка Стэнли.\n" +
                        "\n" +
                        "В феврале этого года Ковальчук в составе команды Олимпийских атлетов из России выиграл Олимпийские игры. Он был признан самым ценным игроком хоккейного турнира.");
    }
}
