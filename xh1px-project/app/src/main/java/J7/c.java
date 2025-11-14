package J7;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public enum c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f2511d;

    c(TimeUnit timeUnit) {
        this.f2511d = timeUnit;
    }
}
