package F7;

import a6.AbstractC0431f;
import a6.AbstractC0434i;
import a6.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o6.y;

/* loaded from: classes.dex */
public final class i extends AbstractC0431f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1630f = 0;

    /* renamed from: d, reason: collision with root package name */
    public Object f1631d;

    /* renamed from: e, reason: collision with root package name */
    public int f1632e;

    public i(int i4) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object[] objArr;
        int i4 = this.f1632e;
        if (i4 == 0) {
            this.f1631d = obj;
        } else if (i4 == 1) {
            if (!o6.j.a(this.f1631d, obj)) {
                this.f1631d = new Object[]{this.f1631d, obj};
            } else {
                return false;
            }
        } else if (i4 < 5) {
            Object obj2 = this.f1631d;
            o6.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj2;
            if (!AbstractC0434i.M0(obj, objArr2)) {
                int i8 = this.f1632e;
                if (i8 == 4) {
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    o6.j.e(copyOf, "elements");
                    LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(copyOf.length));
                    AbstractC0434i.e1(copyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    objArr = linkedHashSet;
                } else {
                    Object[] copyOf2 = Arrays.copyOf(objArr2, i8 + 1);
                    o6.j.d(copyOf2, "copyOf(...)");
                    copyOf2[copyOf2.length - 1] = obj;
                    objArr = copyOf2;
                }
                this.f1631d = objArr;
            } else {
                return false;
            }
        } else {
            Object obj3 = this.f1631d;
            o6.j.c(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!y.b(obj3).add(obj)) {
                return false;
            }
        }
        this.f1632e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f1631d = null;
        this.f1632e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g() == 0) {
            return false;
        }
        if (g() == 1) {
            return o6.j.a(this.f1631d, obj);
        }
        if (g() < 5) {
            Object obj2 = this.f1631d;
            o6.j.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC0434i.M0(obj, (Object[]) obj2);
        }
        Object obj3 = this.f1631d;
        o6.j.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // a6.AbstractC0431f
    public final int g() {
        return this.f1632e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i4 = this.f1632e;
        if (i4 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i4 == 1) {
            return new h(0, this.f1631d);
        }
        if (i4 < 5) {
            Object obj = this.f1631d;
            o6.j.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new g((Object[]) obj);
        }
        Object obj2 = this.f1631d;
        o6.j.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return y.b(obj2).iterator();
    }
}
