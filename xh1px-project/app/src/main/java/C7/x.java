package C7;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class x extends n {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f845c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f846d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(int i4) {
        super(r0.toString(), 1);
        StringBuilder j = AbstractC1149a.j(i4, "must have at least ", " value parameter");
        j.append(i4 > 1 ? "s" : "");
        this.f846d = i4;
    }

    @Override // C7.e
    public final boolean b(R6.f fVar) {
        switch (this.f845c) {
            case 0:
                if (fVar.z0().size() >= this.f846d) {
                    return true;
                }
                return false;
            default:
                if (fVar.z0().size() == this.f846d) {
                    return true;
                }
                return false;
        }
    }

    public x() {
        super("must have exactly 2 value parameters", 1);
        this.f846d = 2;
    }
}
