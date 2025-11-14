package C6;

/* renamed from: C6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024z implements E0.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f783d;

    /* renamed from: e, reason: collision with root package name */
    public final String f784e;

    public C0024z(String str, int i4) {
        this.f783d = i4;
        switch (i4) {
            case 1:
                o6.j.e(str, "query");
                this.f784e = str;
                return;
            default:
                this.f784e = str;
                return;
        }
    }

    @Override // E0.d
    public String l() {
        return this.f784e;
    }

    public String toString() {
        switch (this.f783d) {
            case 0:
                return this.f784e;
            default:
                return super.toString();
        }
    }

    @Override // E0.d
    public void P(E0.c cVar) {
    }
}
