package U1;

import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class i extends AbstractC1829a {

    /* renamed from: d, reason: collision with root package name */
    public static final i f6056d = new i(1, 2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final i f6057e = new i(2, 3, 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i4, int i8, int i9) {
        super(i4, i8);
        this.f6058c = i9;
    }

    @Override // y0.AbstractC1829a
    public final void b(E0.a aVar) {
        switch (this.f6058c) {
            case 0:
                o6.j.e(aVar, "db");
                h2.a.p(aVar, "condition_table").g(new n1.e(2, "threshold", "1"));
                return;
            default:
                o6.j.e(aVar, "db");
                h2.a.p(aVar, "click_table").g(new n1.e(4, "stop_after", null));
                return;
        }
    }
}
