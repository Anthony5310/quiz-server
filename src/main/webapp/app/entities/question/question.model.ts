export interface IQuestion {
  id?: number;
  entitled?: string | null;
  suggestions?: string;
  answer?: string;
}

export class Question implements IQuestion {
  constructor(public id?: number, public entitled?: string | null, public suggestions?: string, public answer?: string) {}
}

export function getQuestionIdentifier(question: IQuestion): number | undefined {
  return question.id;
}
