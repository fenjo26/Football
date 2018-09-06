package kabz.on.foreva.life;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kabz.on.foreva.life.nnnnn.Iwqeqwe;

public class LLasdasdq extends MMSASAD {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oiuqwe);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LLasdasdq.this, Iwqeqwe.class));
            }
        });
        setView("Назван самый высокооплачиваемый спортсмен",
                R.drawable.s1,
                "Американский боксер Флойд Мэйуэзер стал самым высокооплачиваемым спортсменом по версии журнала Forbes. По оценке журналистов, за 2017 год он заработал 285 миллионов долларов.\n" +
                        "\n" +
                        "Большую часть денег (275 миллионов) боксер получил за победу в поединке с бойцом смешанного стиля (ММА) Конором Макгрегором. Ирландец также присутствует в списке, он занял четвертое место, заработав 99 миллионов долларов.\n" +
                        "\n" +
                        "На втором месте расположился нападающий «Барселоны» Лионель Месси, который за год увеличил свое состояние на 111 миллионов долларов. Третьим стал португалец Криштиану Роналду с заработком в 108 миллионов долларов.\n" +
                        "\n" +
                        "Мэйуэзер завершил карьеру в августе 2017-го сразу после победы над Макгрегором. Бой по правилам бокса состоялся в Лас-Вегасе и завершился техническим нокаутом в 10-м раунде. Осенью американец решил начать карьеру в ММА, а в марте он сообщил, что подал документы для получения лицензии бойца смешанного стиля.");
    }
}
