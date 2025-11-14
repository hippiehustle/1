package Q3;

import D4.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f4847e;

    public /* synthetic */ e(f fVar, int i4) {
        this.f4846d = i4;
        this.f4847e = fVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f4846d) {
            case 0:
                return this.f4847e.n();
            default:
                return new y(this.f4847e.m(), 15);
        }
    }
}
