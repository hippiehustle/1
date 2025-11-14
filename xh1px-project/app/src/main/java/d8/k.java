package d8;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f10551a = new j(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f10552b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f10553c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10552b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f10553c = atomicReferenceArr;
    }

    public static final void a(j jVar) {
        int i4;
        o6.j.e(jVar, "segment");
        if (jVar.f10549f == null && jVar.f10550g == null) {
            if (!jVar.f10547d) {
                AtomicReference atomicReference = f10553c[(int) (Thread.currentThread().getId() & (f10552b - 1))];
                j jVar2 = f10551a;
                j jVar3 = (j) atomicReference.getAndSet(jVar2);
                if (jVar3 == jVar2) {
                    return;
                }
                if (jVar3 != null) {
                    i4 = jVar3.f10546c;
                } else {
                    i4 = 0;
                }
                if (i4 >= 65536) {
                    atomicReference.set(jVar3);
                    return;
                }
                jVar.f10549f = jVar3;
                jVar.f10545b = 0;
                jVar.f10546c = i4 + 8192;
                atomicReference.set(jVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final j b() {
        AtomicReference atomicReference = f10553c[(int) (Thread.currentThread().getId() & (f10552b - 1))];
        j jVar = f10551a;
        j jVar2 = (j) atomicReference.getAndSet(jVar);
        if (jVar2 == jVar) {
            return new j();
        }
        if (jVar2 == null) {
            atomicReference.set(null);
            return new j();
        }
        atomicReference.set(jVar2.f10549f);
        jVar2.f10549f = null;
        jVar2.f10546c = 0;
        return jVar2;
    }
}
