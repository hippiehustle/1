package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import t.C1525c;

/* loaded from: classes.dex */
public class X extends AbstractSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f8655e;

    public /* synthetic */ X(Map map, int i4) {
        this.f8654d = i4;
        this.f8655e = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f8654d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((U) this.f8655e).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((g7.z) this.f8655e).put((Comparable) entry2.getKey(), entry2.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f8654d) {
            case 0:
                ((U) this.f8655e).clear();
                return;
            case 1:
                ((g7.z) this.f8655e).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f8654d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((U) this.f8655e).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((g7.z) this.f8655e).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2 && (obj3 == null || !obj3.equals(value2))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f8654d) {
            case 0:
                return new W((U) this.f8655e, 0);
            case 1:
                return new W((g7.z) this.f8655e, 1);
            default:
                return new C1525c((t.e) this.f8655e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f8654d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((U) this.f8655e).remove(entry.getKey());
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((g7.z) this.f8655e).remove(entry2.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f8654d) {
            case 0:
                return ((U) this.f8655e).size();
            case 1:
                return ((g7.z) this.f8655e).size();
            default:
                return ((t.e) this.f8655e).f14670f;
        }
    }
}
