package r6;

import java.util.Random;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1470a extends AbstractC1473d {
    @Override // r6.AbstractC1473d
    public final int a(int i4) {
        return ((-i4) >> 31) & (g().nextInt() >>> (32 - i4));
    }

    @Override // r6.AbstractC1473d
    public final float b() {
        return g().nextFloat();
    }

    @Override // r6.AbstractC1473d
    public final int c() {
        return g().nextInt();
    }

    @Override // r6.AbstractC1473d
    public final long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
