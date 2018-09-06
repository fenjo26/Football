package ru.news.football.qweqw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import ru.news.football.Ooosaa;
import ru.news.football.R;

public class Yoijwkncw extends Ooosaa {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oikwqdoik);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Yoijwkncw.this, "500 Internal Server Error", Toast.LENGTH_SHORT).show();
            }
        });
        setView("«Формула-1» спасла жизнь американской семье",
R.drawable.f2,
                "Просмотр гонок «Формулы-1» помог американцу Роббу Брэди и его семье выжить после того, как на их дом обрушилось дерево. Об этом сообщает Motorsport в понедельник, 9 апреля.\n" +
                        "\n" +
                        "Инцидент произошел еще 25 марта. Супруги Брэди решили посмотреть гонку Гран-при Австралии. Дочку, которая ночевала в спальне родителей, решили не оставлять одну и посадили рядом с собой на диване. После часа трансляции массивное дерево свалилось на дом. Часть гостиной, кабинет, детская комната и спальня в результате падения были разрушены. Телевизор же был в другой части дома.\n" +
                        "\n" +
                        "«Я всегда обожал машины и гонки. Думаю, это и позволило нам выжить», — заявил Брэди.\n" +
                        "\n" +
                        "По словам отца семейства, у него ушел целый день, чтобы осознать, насколько ему повезло. Он также отметил, что собирается посмотреть другой этап «Формулы-1» — Гран-при Бахрейна.");
    }
}
