package jkjew.kjjeh.kddddh.lalaa;

import android.os.Bundle;
import android.support.annotation.Nullable;

import jkjew.kjjeh.kddddh.BaseMainActivity;
import jkjew.kjjeh.kddddh.R;

public class Thdasasd extends BaseMainActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.qweqwdq);
        findViewById(R.id.btn_next1).setEnabled(false);
        setView("Отобравший чемпионский пояс у Валуева британец снова завершил карьеру",
R.drawable.gtgt,
                "Британский боксер Дэвид Хэй, владевший мировыми титулами в первой тяжелой и тяжелой весовых категориях, на своем сайте объявил о завершении карьеры. Спортсмен сделал это в третий раз за последние семь лет.\n" +
                        "\n" +
                        "«Сегодня я объявляю о своем уходе из профессионального бокса. Благодаря ему я смог воплотить свою огромную детскую мечту в жизнь. Это была и мечта моего отца, Дерона, когда он отвел 10-летнего нервного мальчика в любительский боксерский клуб. Сейчас я готов закрыть эту главу моей жизни. Но это не конец моей истории, а просто начало чего-то нового», — заявил Хэй.\n" +
                        "\n" +
                        "В 2011 году, после поражения в объединительном бою с украинцем Владимиром Кличко, британец в первый раз объявил о завершении карьеры. Менее чем через год он вернулся и нокаутировал Дерека Чисору. В ноябре 2013-го он, по совету врачей, решил вновь отказаться от бокса, однако снова вышел на ринг спустя три с половиной года. Последний поединок он провел в марте 2017-го и был нокаутирован соотечественником Тони Белью. Всего на его счету 31 бой в профессиональной карьере. Он одержал 28 побед (26 нокаутом) и потерпел 3 поражения.\n" +
                        "\n" +
                        "После поражения от Хэя карьеру завершил российский тяжеловес Николай Валуев. В 2009 году он не сумел защитить чемпионский пояс по версии WBA.");
    }
}