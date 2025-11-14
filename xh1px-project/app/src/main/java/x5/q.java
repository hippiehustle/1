package x5;

import android.view.View;
import java.util.Comparator;
import k2.C0952b;

/* loaded from: classes.dex */
public final class q implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16219a;

    public /* synthetic */ q(int i4) {
        this.f16219a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16219a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return E2.c.N(Integer.valueOf(((C0952b) ((Z5.j) obj).f7485d).f11966h), Integer.valueOf(((C0952b) ((Z5.j) obj2).f7485d).f11966h));
        }
    }
}
