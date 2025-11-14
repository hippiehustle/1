package c0;

import a.AbstractC0405a;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import t7.C1594d;

/* loaded from: classes.dex */
public final class e extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f9378e;

    public e(f fVar) {
        super(24);
        this.f9378e = fVar;
    }

    @Override // E2.d
    public final void A(Throwable th) {
        this.f9378e.f9379a.d(th);
    }

    @Override // E2.d
    public final void B(A4.a aVar) {
        Set<int[]> G8;
        f fVar = this.f9378e;
        fVar.f9381c = aVar;
        A4.a aVar2 = fVar.f9381c;
        k kVar = fVar.f9379a;
        C1594d c1594d = kVar.f9391g;
        d dVar = kVar.f9393i;
        if (Build.VERSION.SDK_INT >= 34) {
            G8 = q.a();
        } else {
            G8 = AbstractC0405a.G();
        }
        fVar.f9380b = new R.g(aVar2, c1594d, dVar, G8);
        k kVar2 = fVar.f9379a;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.f9385a.writeLock().lock();
        try {
            kVar2.f9387c = 1;
            arrayList.addAll(kVar2.f9386b);
            kVar2.f9386b.clear();
            kVar2.f9385a.writeLock().unlock();
            kVar2.f9388d.post(new A5.c(arrayList, kVar2.f9387c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f9385a.writeLock().unlock();
            throw th;
        }
    }
}
