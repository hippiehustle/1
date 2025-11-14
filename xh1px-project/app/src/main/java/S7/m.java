package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5471b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5472c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5473d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5474e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f5475a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5472c;
        if (atomicIntegerFieldUpdater.get(this) - f5473d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f5462e) {
            f5474e.incrementAndGet(this);
        }
        int i4 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f5475a;
            if (atomicReferenceArray.get(i4) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i4, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5473d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f5472c.get(this) == 0) {
                return null;
            }
            int i8 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (iVar = (i) this.f5475a.getAndSet(i8, null)) != null) {
                if (iVar.f5462e) {
                    f5474e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        S7.m.f5474e.decrementAndGet(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.f5462e == r6) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.compareAndSet(r5, r1, null) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.get(r5) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i c(int i4, boolean z8) {
        int i8 = i4 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f5475a;
        i iVar = (i) atomicReferenceArray.get(i8);
        if (iVar != null) {
        }
        return null;
    }
}
