package Q7;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4941a;

    static {
        try {
            f4941a = H7.m.Y(H7.m.P(Arrays.asList(new M7.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
