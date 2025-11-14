package d4;

import D4.y;
import n6.InterfaceC1162a;

/* renamed from: d4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0600f f10377e;

    public /* synthetic */ C0599e(C0600f c0600f, int i4) {
        this.f10376d = i4;
        this.f10377e = c0600f;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f10376d) {
            case 0:
                return this.f10377e.n();
            default:
                return new y(this.f10377e.m(), 28);
        }
    }
}
