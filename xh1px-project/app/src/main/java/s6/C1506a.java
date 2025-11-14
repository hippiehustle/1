package s6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import o6.j;
import r6.AbstractC1470a;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506a extends AbstractC1470a {
    @Override // r6.AbstractC1473d
    public final int d(int i4, int i8) {
        return ThreadLocalRandom.current().nextInt(i4, i8);
    }

    @Override // r6.AbstractC1473d
    public final long f(long j, long j5) {
        return ThreadLocalRandom.current().nextLong(j, j5);
    }

    @Override // r6.AbstractC1470a
    public final Random g() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.d(current, "current(...)");
        return current;
    }
}
