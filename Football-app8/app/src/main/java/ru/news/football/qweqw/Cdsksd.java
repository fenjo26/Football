package ru.news.football.qweqw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ru.news.football.Ooosaa;
import ru.news.football.R;

public class Cdsksd extends Ooosaa {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onNormalResume();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oikwqdoik);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cdsksd.this, Yoijwkncw.class));
            }
        });
        setView("Автогонщица признала слабость женщин в «Формуле-1» и подверглась критике",
                R.drawable.fff111,
            "Испанская автогонщица и пилот по развитию команды «Рено» Кармен Хорда поделилась мнением об управлении женщинами болидов «Формулы-1», после чего была подвергнута критике со стороны мужчины-пилота «Формулы-1» Дженсона Баттона. Об этом сообщает CNN.\n" +
                    "\n" +
                    "Побывав за рулем электромобиля для «Формулы-E», Хорда отметила, что машина действительно больше подходит для женщин-пилотов, чем болиды «Формулы-1».\n" +
                    "\n" +
                    "«Управление этой машиной требует меньше усилий, чем в \"Формуле-1\" из-за прижимной силы и усилителя руля. Поэтому да — это проще. Проблема женщин в \"Формуле-1\" и \"Формуле-2\" — недостаток в физике, здесь этого не будет», — отметила 29-летняя автогонщица.\n" +
                    "\n" +
                    "Баттон раскритиковал высказывание Хорды. 38-летний спортсмен отметил, что среди женщин есть достаточно физически сильные автогонщицы, и привел в пример пилота NASCAR Данику Патрик.\n" +
                    "\n" +
                    "«Кармен! Этим комментарием ты не поможешь достойным представительницам автоспорта. Спроси Данику Патрик о том, что значит быть достаточно сильной для гоночного автомобиля. Эта женщина надерет мой зад в спортзале и наверняка прямо сейчас могла бы сесть за руль болида \"Формулы-1\". Думаю, в твоем случае дело не в физическом барьере, Кармен», — написал Баттон в Twitter.\n" +
                    "\n" +
                    "Женщины-пилоты в «Формуле-1» — большая редкость. История соревнований знает только пять спортсменок.");
    }
}
