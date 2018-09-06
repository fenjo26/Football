package dfkk.jgge.jdber.reerr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dfkk.jgge.jdber.reerr.sdjknsdsd.Pvsisdsd;

public class MainActivity extends BasvseAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.ertoiucvxv);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pvsisdsd.class));
            }
        });
        setView("Мать Овечкина предложила критикам сына закрыть рты",
                R.drawable.refferf,
                "Мать капитана «Вашингтон Кэпиталс» Александра Овечкина Татьяна прокомментировала победу сына в Кубке Стэнли и ответила его критикам. Ее слова приводит «Чемпионат.com».\n" +
                        "\n" +
                        "«Честно говоря, я очень горжусь ребятами — Овечкиным, [Евгением] Кузнецовым. В особенности своим сыном. Ребята здесь защищают честь нашей страны. Надо гордиться ими, а не обливать грязью. Сашку многие обливают, говорят, что ты такой-то и сякой-то. Так вот пускай они закроют рты, Саша прославляет нашу страну, прославляет наш хоккей!», — заявила мать хоккеиста.\n" +
                        "\n" +
                        "Женщина отметила вклад своего сына в хоккей. «Саша вошел в число ста лучших игроков за всю историю НХЛ. Он каждый год завоевывает призы! Каждый год, понимаете? Из года в год он становится лучшим. Это дорогого стоит, поэтому еще раз повторю: он прославляет наш хоккей», — добавила она.\n" +
                        "\n" +
                        "8 июня «Вашингтон» обыграл «Вегас Голден Найтс» в пятом матче финальной серии (4:3) и впервые в истории завоевал Кубок Стэнли. Овечкин забросил одну из шайб и был признан самым ценным игроком плей-офф турнира.\n" +
                        "\n" +
                        "Овечкин выступает за «столичных» с 2005 года. До нынешнего сезона россиянин ни разу не выходил в финал Кубка Стэнли.");
    }
}
