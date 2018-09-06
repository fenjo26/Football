package tonny.howk.pro.skyter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import tonny.howk.pro.skyter.uwc.Wwecklwec;

public class MainActivity extends PcowqActv {

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
                startActivity(new Intent(MainActivity.this, Wwecklwec.class));
            }
        });
        setView("Россиянин и украинец подерутся в чемпионском бою в Москве",
                R.drawable.box,
                "Российский боксер Мурат Гассиев в финальном поединке Всемирной боксерской суперсерии встретится с украинцем Александром Усиком. Бой пройдет 21 июля в Москве. Об этом в Facebook сообщил генеральный секретарь Федерации бокса России Умар Кремлев.\n" +
                        "\n" +
                        "Поединок состоится в спортивном комплексе «Олимпийский». На кону будут стоять титулы Международной боксерской федерации (IBF) и Всемирной боксерской ассоциации (WBA), которыми владеет Гассиев, а также пояса Всемирной боксерской организации (WBO) и Всемирного боксерского совета (WBC), принадлежащие Усику.\n" +
                        "\n" +
                        "Изначально бой должен был состояться 11 мая в городе Джидда (Саудовская Аравия), однако в апреле он был перенесен на лето.\n" +
                        "\n" +
                        "В полуфинале Всемирной боксерской суперсерии в тяжелом весе Гассиев нокаутировал кубинца Юниера Дортикоса, а Усик судейским решением победил латвийца Майриса Бриедиса.\n" +
                        "\n" +
                        "В активе россиянина 26 побед (19 — нокаутом) при отсутствии поражений. Украинец победил во всех 14 поединках (11 — нокаутом).");
    }
}
