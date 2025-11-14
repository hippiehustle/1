package x6;

import a6.AbstractC0434i;
import java.lang.reflect.Field;

/* renamed from: x6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808l extends AbstractC1809m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1808l(Field field, boolean z8, int i4) {
        super(field, z8);
        this.f16263e = i4;
    }

    @Override // x6.x
    public void e(Object[] objArr) {
        switch (this.f16263e) {
            case 1:
                o6.j.e(objArr, "args");
                super.e(objArr);
                f(AbstractC0434i.X0(objArr));
                return;
            default:
                super.e(objArr);
                return;
        }
    }
}
