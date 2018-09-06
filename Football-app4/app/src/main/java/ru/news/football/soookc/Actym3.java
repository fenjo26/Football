package dzvon.dzvonechku.sokoly.soookc;

import android.os.Bundle;
import android.support.annotation.Nullable;

import dzvon.dzvonechku.sokoly.Glavsddkl;
import dzvon.dzvonechku.sokoly.R;

public class Actym3 extends Glavsddkl {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setEnabled(false);
        setView("Российского форварда захотели сразу десять клубов НХЛ",
R.drawable.mnbbbb,
                "Нападающий «Коламбус Блю Джекетс» Артемий Панарин попал в сферу интересов десяти клубов Национальной хоккейной лиги (НХЛ). Об этом в своем Twitter-аккаунте написал журналист TSN Даррен Дрегер.\n" +
                        "\n" +
                        "По его информации, над обменом с участием россиянина раздумывают руководители следующих клубов: «Лос-Анджелес Кингз», «Сан-Хосе Шаркс», «Даллас Старз», «Тампа-Бэй Лайтнинг», «Флорида Пантерз», «Нью-Йорк Айлендерс», «Нью-Йорк Рейнджерс», «Филадельфия Флайерз», «Нью-Джерси Девилз», а также «Бостон Брюинз».\n" +
                        "\n" +
                        "Не исключено, что в ближайшее время Панарин окажется в одной команде с соотечественником Ильей Ковальчуком. 35-летний форвард сборной России нынешним летом вернулся в НХЛ, подписав контракт с «Лос-Анджелес Кингз».\n" +
                        "\n" +
                        "Первым клубом в США для Панарина стал «Чикаго Блэкхокс». С 2017 года нападающий защищает цвета «Коламбус Блю Джекетс». В регулярном сезоне-2017/2018 26-летний Панарин принял участие в 81 матче, забросил 27 шайб и отдал 55 голевых передач.");
    }
}
