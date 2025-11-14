package w6;

import C6.AbstractC0015p;
import C6.C0014o;
import java.lang.reflect.Method;
import java.util.Comparator;

/* renamed from: w6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1719f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15852a;

    public /* synthetic */ C1719f(int i4) {
        this.f15852a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15852a) {
            case 0:
                return E2.c.N(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return E2.c.N(((W) ((u6.l) obj)).b(), ((W) ((u6.l) obj2)).b());
            default:
                I7.k kVar = F.f15791d;
                Integer b4 = AbstractC0015p.b((C0014o) obj, (C0014o) obj2);
                if (b4 != null) {
                    return b4.intValue();
                }
                return 0;
        }
    }
}
