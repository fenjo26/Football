package kabz.on.foreva.life.nnnnn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kabz.on.foreva.life.MMSASAD;
import kabz.on.foreva.life.R;

public class Iwqeqwe extends MMSASAD {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onNormalResume();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oiuqwe);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Iwqeqwe.this, Ackmqq.class));
            }
        });
        setView("В Бельгии двадцать велосипедистов врезались в автомобиль",
                R.drawable.sad1,
                "Во время велогонки в Бельгии произошло столкновение двадцати участников местного чемпионата с автомобилем. Об этом сообщает телерадиокомпания RTBF.\n" +
                        "\n" +
                        "В результате аварии пострадали двадцать велосипедистов, среди которых есть граждане Бельгии, Германии и Голландии. Столкновение произошло в трех километрах от финиша гонки, во время второго из трех соревнований в дневной программе мероприятия.\n" +
                        "\n" +
                        "Виновницей ДТП стала женщина, управлявшая автомобилем. Сообщается, что она совершила разворот перед приближавшимися гонщиками. Лидер гонки въехал со скоростью 70-80 километров в час в разворачивающийся автомобиль, следовавшие за ним спортсмены также не сумели избежать столкновения.\n" +
                        "\n" +
                        "Трое велосипедистов получили открытые переломы, четверо участников попали в больницу с сотрясением мозга. Остальные велосипедисты получили незначительные травмы. На место происшествия прибыли девять машин скорой помощи, и пострадавших отвезли в больницы региона.\n" +
                        "\n" +
                        "16 июня в Москве на улице Ильинка водитель такси въехал в толпу людей. Пострадали восемь человек, в том числе граждане Мексики, приехавшие на чемпионат мира по футболу. Виновник ДТП гражданин Киргизии Анарбек Чынгыз, работавший в сервисе «Яндекс.Такси», пытался сбежать с места преступления, но был задержан. Он объяснил, что перепутал педали тормоза и газа из-за долгого отсутствия сна."
        );
    }
}