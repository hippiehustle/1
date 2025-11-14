package J7;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final long f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2524b;

    public h(int i4, long j) {
        this.f2523a = j;
        this.f2524b = i4;
    }

    @Override // J7.i
    public final d toInstant() {
        d dVar = d.f2512f;
        d dVar2 = d.f2512f;
        long j = dVar2.f2514d;
        long j5 = this.f2523a;
        if (j5 >= j) {
            d dVar3 = d.f2513g;
            if (j5 <= dVar3.f2514d) {
                long j8 = this.f2524b;
                long j9 = j8 / 1000000000;
                if ((j8 ^ 1000000000) < 0 && j9 * 1000000000 != j8) {
                    j9--;
                }
                long j10 = j5 + j9;
                if ((j5 ^ j10) < 0 && (j9 ^ j5) >= 0) {
                    if (j5 <= 0) {
                        return dVar2;
                    }
                    return dVar3;
                }
                if (j10 >= -31557014167219200L) {
                    if (j10 <= 31556889864403199L) {
                        long j11 = j8 % 1000000000;
                        return new d((int) (j11 + ((((j11 ^ 1000000000) & ((-j11) | j11)) >> 63) & 1000000000)), j10);
                    }
                    return dVar3;
                }
                return dVar2;
            }
        }
        throw new e("The parsed date is outside the range representable by Instant (Unix epoch second " + j5 + ')');
    }
}
