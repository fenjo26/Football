package vido.luka.chorvatkia.last_activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import vido.luka.chorvatkia.BaseMainActivity;
import vido.luka.chorvatkia.R;

public class Activity3Article extends BaseMainActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setEnabled(false);
        setView("Вылетевшие с ЧМ японцы оставили чистую раздевалку и послание на русском языке",
R.drawable.q3323234234,
                "Фото: @priscillaboca\n" +
                        "Футболисты сборной Японии после вылета с чемпионата мира-2018 прибрались в раздевалке и оставили организаторам послание с благодарностью на русском языке. Об этом сообщает World of buzz.\n" +
                        "\n" +
                        "После игры японцы привели раздевалку в порядок и оставили на столе записку, в которой по-русски было написано: «Спасибо». Матч состоялся на стадионе Ростова-на-Дону." +
                        "\n" +
                        "2 июля сборная Японии по ходу встречи вела со счетом 2:0, однако в итоге проиграла бельгийцам (2:3). Сборная Бельгии в четвертьфинале сыграет с командой Бразилии, победившей мексиканцев (2:0).\n" +
                        "\n" +
                        "Ранее японские болельщики убрали весь мусор с трибун стадиона в Саранске после матча группового этапа мундиаля с Колумбией. Репутацию чистоплотных фанатов японцы заслужили после чемпионата мира-2014 в Бразилии, когда они также приводили трибуны в порядок после матчей национальной команды.\n" +
                        "\n" +
                        "Чемпионат мира-2018 завершится 15 июля матчем в «Лужниках».");
    }
}
