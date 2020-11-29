package lessons.lesson10.task4;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashDocument implements Generatable<CashDocument>, Save {
    private static final List<Double> NOMINALS;

    private UUID salaryDocumentUuid;
    private Map<Double, Long> nominalCount;

    static {
        NOMINALS = Stream.of(Config.getProperty("cash.nominals", String.class).split("\\s*,\\s*"))
                .map(Double::valueOf)
                .collect(Collectors.toList());
    }

    @Override
    public CashDocument generate() {
        return null;
    }

    @Override
    public void save() throws IOException {

    }
}
