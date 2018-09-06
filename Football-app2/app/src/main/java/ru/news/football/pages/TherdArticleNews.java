package raft.atlant.ylen.kz.pages;

import android.os.Bundle;
import android.support.annotation.Nullable;

import raft.atlant.ylen.kz.BasePage;
import raft.atlant.ylen.kz.R;

public class TherdArticleNews extends BasePage {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setEnabled(false);
        setView("Английские фанаты подрались между собой во время победного матча сборной",
R.drawable.qweqwe23,
                "Просмотр матча 1/8 финала чемпионата мира между сборными Англии и Колумбии в одном из британских пабов закончился массовой дракой. Видео опубликовано на YouTube-канале издания The Sun.\n" +
                        "\n" +
                        "Инцидент произошел в одном из пабов города Чатем, графства Кент. Как отмечается в описании к видео, драка проходила во время игры сборной Англии в 1/8 финала чемпионата мира. На двухминутном ролике можно наблюдать, как английские фанаты бросают друг в друга бутылки и кружки. В потасовке также участвовали женщины.\n" +
                        "\n" +
                        "3 июля сборная Англии победила колумбийцев в серии пенальти со счетом 4:3. Соперником англичан в 1/4 финала турнира станет Швеция. Матч состоится 7 июля и начнется в 17:00 по московскому времени.\n" +
                        "\n" +
                        "Чемпионат мира-2018 проходит в 11 городах России и завершится 15 июля.");
    }
}
