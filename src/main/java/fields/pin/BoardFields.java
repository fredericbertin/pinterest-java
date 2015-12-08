package fields.pin;

import fields.FieldSerializer;
import fields.Fields;

import java.util.HashSet;
import java.util.Set;

public class BoardFields implements Fields {
    private final Set<String> fields = new HashSet<>();

    @Override
    public String build() {
        return FieldSerializer.serialize(fields);
    }

    @Override
    public Fields setAll() {
        return this.setId().setName().setUrl();
    }

    public BoardFields setId() {
        fields.add("id");
		return this;
    }

    public BoardFields setName() {
        fields.add("name");
		return this;
    }

    public BoardFields setUrl() {
        fields.add("url");
		return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardFields that = (BoardFields) o;

        return !(fields != null ? !fields.equals(that.fields) : that.fields != null);

    }

    @Override
    public int hashCode() {
        return fields != null ? fields.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "BoardFields{" +
                "fields=" + fields +
                '}';
    }
}