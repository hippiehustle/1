package x6;

import a6.AbstractC0434i;
import java.lang.reflect.Field;

/* renamed from: x6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812p extends AbstractC1813q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1812p(Field field, boolean z8, boolean z9, int i4) {
        super(field, z8, z9);
        this.f16265f = i4;
    }

    @Override // x6.AbstractC1813q, x6.x
    public void e(Object[] objArr) {
        switch (this.f16265f) {
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
